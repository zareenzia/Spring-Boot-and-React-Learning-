import React, { useEffect, useState } from "react";

export default function Student() {

  const [posts, setPost] = useState();
  const [isError, setError] = useState(false);


  useEffect(()=>{
    fetch('https://jsonplaceholder.typicode.com/posts')
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
            <h1>Name: { post.title}</h1>
            <div className="info_container"> {post.body}</div>
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
