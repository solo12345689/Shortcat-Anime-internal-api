.class Lrh/c$e;
.super Lrh/c$y;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrh/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "e"
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
    invoke-direct {p0}, Lrh/c$e;-><init>()V

    return-void
.end method


# virtual methods
.method a(LDg/b;Ljava/lang/Object;)LKg/a;
    .locals 3

    .line 1
    invoke-virtual {p1}, LDg/b;->p()Lzg/b;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-virtual {p2}, Lzg/b;->D()[B

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-virtual {p1}, LDg/b;->l()LDg/a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1}, LDg/a;->l()Lzg/t;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-static {p1}, Lrh/e;->f(Lzg/t;)Lah/b;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    new-instance v0, Lah/d;

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    array-length v2, p2

    .line 25
    invoke-static {p2, v1, v2}, LOh/a;->m([BII)[B

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    invoke-direct {v0, p1, p2}, Lah/d;-><init>(Lah/b;[B)V

    .line 30
    .line 31
    .line 32
    return-object v0
.end method
