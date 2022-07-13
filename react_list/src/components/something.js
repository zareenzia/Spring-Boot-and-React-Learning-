import React, { useEffect, useState } from "react";

export default function Something() {

  const [posts, setPost] = useState();
  const [isError, setError] = useState(false);


  useEffect(()=>{
    fetch('http://localhost:8080/products')
    .then((response) => response.json())
    .then((data) => {
        setPost(data)
        console.log(data)
    })
    .catch((err)=>{
        setError(true)
    })
   },[]) 
 
  return (
    <>
      {
      !isError &&
       posts?.map((post) => {
          return (
          <div className="post-container">
            <div key={post.id}>
            <h1>Name: { post.name}</h1>
            {/* <div className="info_container"> {post.body}</div> */}
            <button className="button">See more info</button>
          </div>
          </div>
          )
        })
      }

      {
        isError &&
        <h1>Error Happend</h1>
      }
    </>
  )
}
