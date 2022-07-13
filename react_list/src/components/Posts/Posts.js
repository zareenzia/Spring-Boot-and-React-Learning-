import React,{useEffect, useState} from "react";
import "./Posts.css";
import Post from "../Post/Post";
  
const Posts = () => {
  const blogPosts = [
    {
      title: "The Alchemist",
      author: "Paulo Coelho ",
      body: `The book's main theme is about finding one's destiny, although according to The New York Times, The Alchemist is "more self-help than literature".[4] The advice given to Santiago that "when you `,
     
      imgUrl:
        "https://th.bing.com/th/id/OIP.DSf6YwW3mNc7Z6DWmqs7OAHaLW?pid=ImgDet&rs=1",
    },
    {
      title: "November 9",
      author: "Collen Hoover",
      body: `Life and a dismal last name are the only two things Beyah’s parents ever gave her. After carving her path all on her own, Beyah is well on her way to bigger and better things, thanks to no one but herself. `,
    
      imgUrl:
        "https://i.etsystatic.com/31516582/r/il/c98986/3325474565/il_1140xN.3325474565_rw7x.jpg",
    },
    {
      title: "Heart Bones",
      author: "Collen Hoover",
      body: `Fallon meets Ben,After carving her path all on her own, Beyah is well on her way to bigger and better things, thanks to no one but herself. `,
     
      imgUrl:
        "https://th.bing.com/th/id/R.e0be18c4eac3480521e76274220794ab?rik=%2basmRInImEJHfg&pid=ImgRaw&r=0",
    },
    {
      title: "The kite runner",
      author: "Khalid Hossaini",
      body: `The Kite Runner is the first novel by Afghan-American author Khaled Hosseini. Published in 2003 by Riverhead Books, it tells the story of Amir, a young boy from the Wazir Akbar Khan district of Kabul. `, 
     
      imgUrl:
        "https://th.bing.com/th/id/OIP.NR2WAuzm9DP3O1ZHqwBw7AHaKe?pid=ImgDet&rs=1",
    },
  ];
  
  return (
    <div className="posts-container">
       bn 
      {blogPosts.map((post, index) => (
        <Post key={index} index={index} post={post} />
      ))}
    </div>
  );
};
  
export default Posts;

