import { BrowserRouter as Router, Routes, Route, Link } from 'react-router-dom';
import Home from './Home';
import EvalSheet from './EvalSheet';
import NotFound from './NotFound';

function App() {
  return (
    <Router>
      <nav style={{ padding: '10px', background: '#eee' }}>
        <Link to="/" style={{ marginRight: '10px' }}>Home</Link>
        <Link to="/assessment">Assessment</Link>
      </nav>
      
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/evalSheet" element={<EvalSheet />} />
        <Route path="/evalSheet/:deployment_id" element={<EvalSheet />} />
        <Route path="*" element={<NotFound />} />
      </Routes>
    </Router>
  );
}

export default App;