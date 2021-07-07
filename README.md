# Prim-s-Algorithm <br />

edge=0 <br />

while(edge<vertices-1){ <br />
  min=infinity <br />
  x=0 <br />
  y=0 <br />
  loop over all the vertices <br />
    if vertex u is present in MST <br />
      loop  over all the vertices <br />
        if vertex v isnot present on the MAST and vertex v is adjacent to vertex u <br />
          if(weight(u,v)<min) <br />
            min=weight(u,v) <br />
            x=u <br />
            y=v <br />
  mark y as visited <br />
}

