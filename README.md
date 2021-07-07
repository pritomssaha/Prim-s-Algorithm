# Prim-s-Algorithm

edge=0

while(edge<vertices-1){
  min=infinity
  x=0
  y=0
  loop over all the vertices
    if vertex u is present in MST
      loop  over all the vertices
        if vertex v isnot present on the MAST and vertex v is adjacent to vertex u
          if(weight(u,v)<min)
            min=weight(u,v)
            x=u
            y=v
  mark y as visited
}

