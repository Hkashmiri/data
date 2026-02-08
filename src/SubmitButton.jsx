import './App.css';
import './rubric.css'

export default function SubmitButton(handleSubmit){

    return(
        <button id="submit" onClick={handleSubmit}>
            Submit Peer Assessment
            </button>
    )
}

