
import Post from "../Post/Post";
import React, {useState,useEffect} from "react";
import "./Home.scss";
import CssBaseline from '@mui/material/CssBaseline';
import Box from '@mui/material/Box';
import Container from '@mui/material/Container';
function Home()
{

    const [error,setError]=useState(null);
    const [isLoaded,setIsLoaded]=useState(false);
    const [postList,setPostList]=useState([]);



    useEffect(()=>{

        fetch("/posts")
        .then(res=>res.json())
        .then(

            (result)=>{
                setIsLoaded(true);
                setPostList(result); 


            },
            (error)=>{
                setIsLoaded(true);
                setError(error);

            }

    
     ) },[])

    if(error!=null)
    {
        return <div>EROOORRRRRR!!</div>
    }
    else if(!isLoaded)
    {
        return <div>Loading!!</div>
    }
    else
    {
        return(



           

            <div >
            
           
                <Container maxWidth="lg" fixed className="containerLayout"> 
                     
                {postList.map(post=>(

                        
                    <Post title = {post.title} text = {post.text}  >    </Post>  

                    ))}

                </Container>
             
        


            
               
            
                </div>
            
        );
    }



  
}

export default Home;