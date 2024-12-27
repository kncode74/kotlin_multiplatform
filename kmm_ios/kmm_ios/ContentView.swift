import SwiftUI
import shared

struct ContentView: View {
	let greet = Greeting().greet()
	 @State private var count: Int = 0
    private let counterLogic = CounterLogic()
	var body: some View {
	    VStack(spacing: 20) {
                    Text("Count: \(count)")
                        .font(.largeTitle)
                    Button(action: {
                        count = Int(counterLogic.increment())
                    }) {
                        Text("Increase")
                            .padding()
                            .background(Color.blue)
                            .foregroundColor(.white)
                            .cornerRadius(8)
                    }
                }
                .padding()
	}
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView()
	}
}