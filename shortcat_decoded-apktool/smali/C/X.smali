.class public abstract LC/X;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final a(LA1/b;Ljava/lang/String;)LC/N;
    .locals 1

    .line 1
    new-instance v0, LC/N;

    .line 2
    .line 3
    invoke-static {p0}, LC/X;->f(LA1/b;)LC/v;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-direct {v0, p0, p1}, LC/N;-><init>(LC/v;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public static final b(LC/P$a;LY/m;I)LC/P;
    .locals 2

    .line 1
    invoke-static {}, LY/w;->L()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, -0x1

    .line 8
    const-string v0, "androidx.compose.foundation.layout.<get-navigationBars> (WindowInsets.android.kt:184)"

    .line 9
    .line 10
    const v1, 0x5f23b556

    .line 11
    .line 12
    .line 13
    invoke-static {v1, p2, p0, v0}, LY/w;->U(IIILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    sget-object p0, LC/Q;->x:LC/Q$a;

    .line 17
    .line 18
    const/4 p2, 0x6

    .line 19
    invoke-virtual {p0, p1, p2}, LC/Q$a;->c(LY/m;I)LC/Q;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0}, LC/Q;->d()LC/a;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-static {}, LY/w;->L()Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    invoke-static {}, LY/w;->T()V

    .line 34
    .line 35
    .line 36
    :cond_1
    return-object p0
.end method

.method public static final c(LC/P$a;LY/m;I)LC/P;
    .locals 2

    .line 1
    invoke-static {}, LY/w;->L()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, -0x1

    .line 8
    const-string v0, "androidx.compose.foundation.layout.<get-safeDrawing> (WindowInsets.android.kt:234)"

    .line 9
    .line 10
    const v1, -0x2f269e4

    .line 11
    .line 12
    .line 13
    invoke-static {v1, p2, p0, v0}, LY/w;->U(IIILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    sget-object p0, LC/Q;->x:LC/Q$a;

    .line 17
    .line 18
    const/4 p2, 0x6

    .line 19
    invoke-virtual {p0, p1, p2}, LC/Q$a;->c(LY/m;I)LC/Q;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0}, LC/Q;->e()LC/P;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-static {}, LY/w;->L()Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    invoke-static {}, LY/w;->T()V

    .line 34
    .line 35
    .line 36
    :cond_1
    return-object p0
.end method

.method public static final d(LC/P$a;LY/m;I)LC/P;
    .locals 2

    .line 1
    invoke-static {}, LY/w;->L()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, -0x1

    .line 8
    const-string v0, "androidx.compose.foundation.layout.<get-statusBars> (WindowInsets.android.kt:192)"

    .line 9
    .line 10
    const v1, -0x283d10ee

    .line 11
    .line 12
    .line 13
    invoke-static {v1, p2, p0, v0}, LY/w;->U(IIILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    sget-object p0, LC/Q;->x:LC/Q$a;

    .line 17
    .line 18
    const/4 p2, 0x6

    .line 19
    invoke-virtual {p0, p1, p2}, LC/Q$a;->c(LY/m;I)LC/Q;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0}, LC/Q;->f()LC/a;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-static {}, LY/w;->L()Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    invoke-static {}, LY/w;->T()V

    .line 34
    .line 35
    .line 36
    :cond_1
    return-object p0
.end method

.method public static final e(LC/P$a;LY/m;I)LC/P;
    .locals 2

    .line 1
    invoke-static {}, LY/w;->L()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, -0x1

    .line 8
    const-string v0, "androidx.compose.foundation.layout.<get-systemBars> (WindowInsets.android.kt:200)"

    .line 9
    .line 10
    const v1, -0x10dd45b4

    .line 11
    .line 12
    .line 13
    invoke-static {v1, p2, p0, v0}, LY/w;->U(IIILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    sget-object p0, LC/Q;->x:LC/Q$a;

    .line 17
    .line 18
    const/4 p2, 0x6

    .line 19
    invoke-virtual {p0, p1, p2}, LC/Q$a;->c(LY/m;I)LC/Q;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0}, LC/Q;->g()LC/a;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-static {}, LY/w;->L()Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    invoke-static {}, LY/w;->T()V

    .line 34
    .line 35
    .line 36
    :cond_1
    return-object p0
.end method

.method public static final f(LA1/b;)LC/v;
    .locals 4

    .line 1
    new-instance v0, LC/v;

    .line 2
    .line 3
    iget v1, p0, LA1/b;->a:I

    .line 4
    .line 5
    iget v2, p0, LA1/b;->b:I

    .line 6
    .line 7
    iget v3, p0, LA1/b;->c:I

    .line 8
    .line 9
    iget p0, p0, LA1/b;->d:I

    .line 10
    .line 11
    invoke-direct {v0, v1, v2, v3, p0}, LC/v;-><init>(IIII)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method
