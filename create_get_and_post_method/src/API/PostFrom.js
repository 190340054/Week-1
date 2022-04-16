import React, { Component } from 'react'
import axios from 'axios'

export class PostFrom extends Component {
    constructor(props) {
      super(props)
    
      this.state = {
         userId :'',
         firstName : '',
         lastName : ''

      }
    }

    changeHandler=(e)  =>{
        this.setState({
            [e.target.name]: e.target.value
        })
    }

    submitHandler = (e) => {
        e.preventDefault()
        axios.post('https://jsonplaceholder.typicode.com/posts', this.state)
        .then(response => {
            console.log(response)
        })
    }
    
    render() {
        const {userId, firstName, lastName} = this.state
        return (
            <div>
                <form onSubmit={this.submitHandler}>
                <div>
                    <label>UserID</label>
                    <input 
                    type='text' 
                    name ='userId' 
                    onChange={this.changeHandler}
                    value={userId}></input>
                </div>
                <div>
                <label>First Name</label>
                    <input 
                    type='text' 
                    name ='firstName' 
                        onChange={this.changeHandler}
                    value={firstName}></input>
                </div>
                <div>
                <label>Last Name</label>
                    <input 
                    type='text' 
                    name ='lastName' 
                    onChange={this.changeHandler}
                    value={lastName}></input>
                </div>
                <button type='submit'>Submit Now</button>
                </form>
            </div>
        )
    }
}

export default PostFrom
