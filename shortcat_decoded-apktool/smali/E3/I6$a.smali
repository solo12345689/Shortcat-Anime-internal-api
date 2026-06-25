.class final LE3/I6$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LE3/h3$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LE3/I6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field private final a:LE3/q;

.field private final b:I


# direct methods
.method public constructor <init>(LE3/q;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LE3/I6$a;->a:LE3/q;

    .line 5
    .line 6
    iput p2, p0, LE3/I6$a;->b:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public F(ILE3/T6;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, LE3/I6$a;->a:LE3/q;

    .line 2
    .line 3
    invoke-virtual {p2}, LE3/T6;->b()Landroid/os/Bundle;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-interface {v0, p1, p2, p3}, LE3/q;->w2(ILandroid/os/Bundle;Landroid/os/Bundle;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public H()Landroid/os/IBinder;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/I6$a;->a:LE3/q;

    .line 2
    .line 3
    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public a(ILE3/W6;ZZI)V
    .locals 1

    .line 1
    iget-object v0, p0, LE3/I6$a;->a:LE3/q;

    .line 2
    .line 3
    invoke-virtual {p2, p3, p4}, LE3/W6;->a(ZZ)LE3/W6;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-virtual {p2, p5}, LE3/W6;->c(I)Landroid/os/Bundle;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-interface {v0, p1, p2}, LE3/q;->u2(ILandroid/os/Bundle;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public b(I)V
    .locals 0

    .line 1
    iget-object p1, p0, LE3/I6$a;->a:LE3/q;

    .line 2
    .line 3
    invoke-static {p1}, LE3/a7;->a(LE3/q;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public d(I)V
    .locals 1

    .line 1
    iget-object v0, p0, LE3/I6$a;->a:LE3/q;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LE3/q;->d(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    if-eqz p1, :cond_2

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-class v1, LE3/I6$a;

    .line 12
    .line 13
    if-eq v0, v1, :cond_1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    check-cast p1, LE3/I6$a;

    .line 17
    .line 18
    invoke-virtual {p0}, LE3/I6$a;->H()Landroid/os/IBinder;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {p1}, LE3/I6$a;->H()Landroid/os/IBinder;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    return p1

    .line 31
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 32
    return p1
.end method

.method public hashCode()I
    .locals 1

    .line 1
    invoke-virtual {p0}, LE3/I6$a;->H()Landroid/os/IBinder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, LK1/b;->b([Ljava/lang/Object;)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public l(ILE3/X6;)V
    .locals 1

    .line 1
    iget-object v0, p0, LE3/I6$a;->a:LE3/q;

    .line 2
    .line 3
    invoke-virtual {p2}, LE3/X6;->b()Landroid/os/Bundle;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-interface {v0, p1, p2}, LE3/q;->G1(ILandroid/os/Bundle;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public o(ILandroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, LE3/I6$a;->a:LE3/q;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, LE3/q;->m3(ILandroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public s(ILq2/P$b;)V
    .locals 1

    .line 1
    iget-object v0, p0, LE3/I6$a;->a:LE3/q;

    .line 2
    .line 3
    invoke-virtual {p2}, Lq2/P$b;->h()Landroid/os/Bundle;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-interface {v0, p1, p2}, LE3/q;->o2(ILandroid/os/Bundle;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public v(ILE3/w;)V
    .locals 1

    .line 1
    iget-object v0, p0, LE3/I6$a;->a:LE3/q;

    .line 2
    .line 3
    invoke-virtual {p2}, LE3/w;->e()Landroid/os/Bundle;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-interface {v0, p1, p2}, LE3/q;->H0(ILandroid/os/Bundle;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public z(ILE3/M6;Lq2/P$b;ZZ)V
    .locals 5

    .line 1
    iget v0, p0, LE3/I6$a;->b:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    move v0, v2

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v0, v1

    .line 10
    :goto_0
    invoke-static {v0}, Lt2/a;->g(Z)V

    .line 11
    .line 12
    .line 13
    if-nez p4, :cond_2

    .line 14
    .line 15
    const/16 v0, 0x11

    .line 16
    .line 17
    invoke-virtual {p3, v0}, Lq2/P$b;->c(I)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    move v0, v1

    .line 25
    goto :goto_2

    .line 26
    :cond_2
    :goto_1
    move v0, v2

    .line 27
    :goto_2
    if-nez p5, :cond_3

    .line 28
    .line 29
    const/16 v3, 0x1e

    .line 30
    .line 31
    invoke-virtual {p3, v3}, Lq2/P$b;->c(I)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-nez v3, :cond_4

    .line 36
    .line 37
    :cond_3
    move v1, v2

    .line 38
    :cond_4
    iget v3, p0, LE3/I6$a;->b:I

    .line 39
    .line 40
    const/4 v4, 0x2

    .line 41
    if-lt v3, v4, :cond_6

    .line 42
    .line 43
    invoke-virtual {p2, p3, p4, p5}, LE3/M6;->A(Lq2/P$b;ZZ)LE3/M6;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    iget-object p3, p0, LE3/I6$a;->a:LE3/q;

    .line 48
    .line 49
    instance-of p3, p3, LE3/X2;

    .line 50
    .line 51
    if-eqz p3, :cond_5

    .line 52
    .line 53
    invoke-virtual {p2}, LE3/M6;->F()Landroid/os/Bundle;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    goto :goto_3

    .line 58
    :cond_5
    iget p3, p0, LE3/I6$a;->b:I

    .line 59
    .line 60
    invoke-virtual {p2, p3}, LE3/M6;->E(I)Landroid/os/Bundle;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    :goto_3
    iget-object p3, p0, LE3/I6$a;->a:LE3/q;

    .line 65
    .line 66
    new-instance p4, LE3/M6$c;

    .line 67
    .line 68
    invoke-direct {p4, v0, v1}, LE3/M6$c;-><init>(ZZ)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p4}, LE3/M6$c;->b()Landroid/os/Bundle;

    .line 72
    .line 73
    .line 74
    move-result-object p4

    .line 75
    invoke-interface {p3, p1, p2, p4}, LE3/q;->y2(ILandroid/os/Bundle;Landroid/os/Bundle;)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_6
    invoke-virtual {p2, p3, p4, v2}, LE3/M6;->A(Lq2/P$b;ZZ)LE3/M6;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    iget-object p3, p0, LE3/I6$a;->a:LE3/q;

    .line 84
    .line 85
    iget p4, p0, LE3/I6$a;->b:I

    .line 86
    .line 87
    invoke-virtual {p2, p4}, LE3/M6;->E(I)Landroid/os/Bundle;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    invoke-interface {p3, p1, p2, v0}, LE3/q;->u3(ILandroid/os/Bundle;Z)V

    .line 92
    .line 93
    .line 94
    return-void
.end method
