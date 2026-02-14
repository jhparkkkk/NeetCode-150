class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<Double> res = new Stack<>();

        List<Pair<Integer, Integer>> cars = new ArrayList<>();

        for (int i = 0; i<position.length; i++){
            cars.add(new Pair<>(position[i], speed[i]));
            System.out.print(cars.get(i));
        }

        cars.sort((a, b) -> b.getKey() - a.getKey());

        for (int i = 0; i < cars.size(); i++){
            double time = (double)(target - cars.get(i).getKey()) / cars.get(i).getValue();
            System.out.print(time);
            res.push(time);

            if (res.size() >= 2){
                double current_car = res.peek();
                double previous_car = res.get(res.size() - 2);

                if (current_car <= previous_car){
                    res.pop();
                }
            }
        }

        return res.size();
    }
}
