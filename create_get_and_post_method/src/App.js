import logo from './logo.svg';
import './App.css';
import PostList from './API/PostList';
import PostFrom from './API/PostFrom';

function App() {
  return (
    <div className="App">
      <h1>The API</h1>
       <PostFrom></PostFrom>
       <PostList></PostList>
    </div>
  );
}

export default App;
