.class public abstract LW/i;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final a(LC/P$a;LY/m;I)LC/P;
    .locals 3

    .line 1
    invoke-static {}, LY/w;->L()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    const-string v1, "androidx.compose.material3.internal.<get-systemBarsForVisualComponents> (SystemBarsDefaultInsets.android.kt:23)"

    .line 9
    .line 10
    const v2, 0x77e9cd62

    .line 11
    .line 12
    .line 13
    invoke-static {v2, p2, v0, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    and-int/lit8 p2, p2, 0xe

    .line 17
    .line 18
    invoke-static {p0, p1, p2}, LC/X;->e(LC/P$a;LY/m;I)LC/P;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-static {}, LY/w;->L()Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    invoke-static {}, LY/w;->T()V

    .line 29
    .line 30
    .line 31
    :cond_1
    return-object p0
.end method
