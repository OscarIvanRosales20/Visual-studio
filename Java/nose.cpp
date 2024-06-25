#include <iostream>
    #include <list>

using namespace std;

#define NUM_V 4

bool helper(list<int> *graph, int u, bool* visited, bool*recStack){
    visited[u]=true;
    recStack[u]=true;
    list<int>::iterator i;

    for(i =graph[u].begin(); i != graph[u].end(); ++i){
        if (recStack[*i])
        {
            return true;
        }
        else if (*i == u)
        {
            return true;
        }
        else if (!visited[*i])
        {
            if(helper(graph, *i, visited, recStack))
                return true;
        }
        
    }
    recStack[u] = false;
    return false;
}

bool isCyclic(list<int> *graph, int V){
    bool visited[V];
    bool recStack[V];

    for (int i =0; i <V; i++)
        visited[i] = false, recStack[i]= false;
    
    for(int u=0; u<V; u++){
        if(visited[u] == false){
            if(helper(graph, u, visited, recStack))
                return true;
        }
    }
    return false;


    //Driver function
    int main(){
        list<int> *graph = new list<int>[NUM_V];
        graph[0].push_back(1);
        graph[0].push_back(2);
        graph[1].push_back(2);
        graph[2].push_back(0);
        graph[2].push_back(3);
        graph[3].push_back(3);
        bool res = isCyclic(graph, NUM_V);
        cout<<res<<endl;
    }
}