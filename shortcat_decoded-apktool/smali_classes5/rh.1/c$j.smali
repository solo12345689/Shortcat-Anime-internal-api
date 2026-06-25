.class Lrh/c$j;
.super Lrh/c$y;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrh/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "j"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lrh/c$y;-><init>(Lrh/c$a;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method static b(Lgh/e;Lzg/b;)Lgh/g;
    .locals 4

    .line 1
    :try_start_0
    invoke-virtual {p1}, Lzg/b;->D()[B

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lzg/y;->v([B)Lzg/y;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    instance-of v1, v0, Lzg/B;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-static {v0}, Lzg/B;->A(Ljava/lang/Object;)Lzg/B;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    new-instance v1, Lgh/g;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {v0, v2}, Lzg/B;->B(I)Lzg/e;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-static {v2}, Lzg/u;->z(Ljava/lang/Object;)Lzg/u;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v2}, Lzg/u;->B()[B

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    const/4 v3, 0x1

    .line 33
    invoke-virtual {v0, v3}, Lzg/B;->B(I)Lzg/e;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {v0}, Lzg/u;->z(Ljava/lang/Object;)Lzg/u;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0}, Lzg/u;->B()[B

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-direct {v1, p0, v2, v0}, Lgh/g;-><init>(Lgh/e;[B[B)V

    .line 46
    .line 47
    .line 48
    return-object v1

    .line 49
    :cond_0
    invoke-static {v0}, Lzg/u;->z(Ljava/lang/Object;)Lzg/u;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v0}, Lzg/u;->B()[B

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    new-instance v1, Lgh/g;

    .line 58
    .line 59
    invoke-direct {v1, p0, v0}, Lgh/g;-><init>(Lgh/e;[B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 60
    .line 61
    .line 62
    return-object v1

    .line 63
    :catch_0
    new-instance v0, Lgh/g;

    .line 64
    .line 65
    invoke-virtual {p1}, Lzg/b;->D()[B

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-direct {v0, p0, p1}, Lgh/g;-><init>(Lgh/e;[B)V

    .line 70
    .line 71
    .line 72
    return-object v0
.end method


# virtual methods
.method a(LDg/b;Ljava/lang/Object;)LKg/a;
    .locals 1

    .line 1
    invoke-virtual {p1}, LDg/b;->l()LDg/a;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-virtual {p2}, LDg/a;->l()Lzg/t;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-static {p2}, Lrh/e;->v(Lzg/t;)Lgh/e;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    new-instance v0, Lgh/g;

    .line 14
    .line 15
    invoke-virtual {p1}, LDg/b;->p()Lzg/b;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1}, Lzg/b;->D()[B

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-direct {v0, p2, p1}, Lgh/g;-><init>(Lgh/e;[B)V

    .line 24
    .line 25
    .line 26
    return-object v0
.end method
