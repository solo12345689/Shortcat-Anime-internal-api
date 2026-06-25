.class Lrh/c$w;
.super Lrh/c$y;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrh/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "w"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lrh/c$y;-><init>(Lrh/c$a;)V

    return-void
.end method

.method synthetic constructor <init>(Lrh/c$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lrh/c$w;-><init>()V

    return-void
.end method


# virtual methods
.method a(LDg/b;Ljava/lang/Object;)LKg/a;
    .locals 4

    .line 1
    :try_start_0
    invoke-virtual {p1}, LDg/b;->r()Lzg/y;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-static {p2}, Lzg/u;->z(Ljava/lang/Object;)Lzg/u;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-virtual {p2}, Lzg/u;->B()[B

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-virtual {p1}, LDg/b;->l()LDg/a;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, LDg/a;->l()Lzg/t;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v0}, Lrh/e;->U(Lzg/t;)Lqh/e;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    new-instance v1, Lqh/g;

    .line 26
    .line 27
    array-length v2, p2

    .line 28
    const/4 v3, 0x4

    .line 29
    invoke-static {p2, v3, v2}, LOh/a;->m([BII)[B

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    invoke-direct {v1, v0, p2}, Lqh/g;-><init>(Lqh/e;[B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    .line 35
    .line 36
    return-object v1

    .line 37
    :catch_0
    invoke-virtual {p1}, LDg/b;->p()Lzg/b;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    invoke-virtual {p2}, Lzg/b;->D()[B

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    invoke-virtual {p1}, LDg/b;->l()LDg/a;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {p1}, LDg/a;->l()Lzg/t;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-static {p1}, Lrh/e;->U(Lzg/t;)Lqh/e;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    new-instance v0, Lqh/g;

    .line 58
    .line 59
    invoke-direct {v0, p1, p2}, Lqh/g;-><init>(Lqh/e;[B)V

    .line 60
    .line 61
    .line 62
    return-object v0
.end method
