import React from "react";
import "./Post.css";
const Post = ({ post: { title, body,
	imgUrl, author }, index }) => {
	return (
		<div className="post-container">
			<div>
				<h1 className="heading">{title}</h1>

				<div className="info_container">
					<div className="info">
						<h4>Written by: {author}</h4>
					</div>
					<p>{body}</p>
					<button>read more</button>
				</div>
			</div>
			<div className="info_container">
				<img className="image" src={imgUrl} alt="post" />
			</div>
		</div>
	);
};

export default Post;
