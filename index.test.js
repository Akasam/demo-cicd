const request = require('supertest');
const { app, server } = require('./index');

describe('GET /', () => {
    afterAll(done => {
        server.close(done);
    });

    it('should return wrong message', async () => {
        const response = await request(app).get('/');
        expect(response.text).toBe('Wrong message'); // This will fail
        expect(response.statusCode).toBe(200);
    });
});