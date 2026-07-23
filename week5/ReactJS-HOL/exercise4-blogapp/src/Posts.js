import React from "react";
import Post from "./Post";

class Posts extends React.Component {

    constructor(props) {
        super(props);

        this.state = {
            posts: []
        };
    }

    loadPosts() {

        fetch("https://jsonplaceholder.typicode.com/posts")
            .then(response => response.json())
            .then(data => {

                const posts = data.map(
                    item => new Post(item.id, item.title, item.body)
                );

                this.setState({
                    posts: posts
                });

            })
            .catch(error => {
                console.log(error);
            });

    }

    componentDidMount() {
        this.loadPosts();
    }

    componentDidCatch(error) {
        alert(error);
    }

    render() {

        return (

            <div>

                <h1>Blog Posts</h1>

                {
                    this.state.posts.map(post => (

                        <div
                            key={post.id}
                            style={{
                                border: "1px solid black",
                                margin: "10px",
                                padding: "10px"
                            }}
                        >

                            <h3>{post.title}</h3>

                            <p>{post.body}</p>

                        </div>

                    ))
                }

            </div>

        );
    }

}

export default Posts;