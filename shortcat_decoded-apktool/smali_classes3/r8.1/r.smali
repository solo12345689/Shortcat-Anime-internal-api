.class final Lr8/r;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lp8/h;


# instance fields
.field private final a:Lr8/o;

.field private final b:Ljava/lang/String;

.field private final c:Lp8/c;

.field private final d:Lp8/g;

.field private final e:Lr8/s;


# direct methods
.method constructor <init>(Lr8/o;Ljava/lang/String;Lp8/c;Lp8/g;Lr8/s;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr8/r;->a:Lr8/o;

    .line 5
    .line 6
    iput-object p2, p0, Lr8/r;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lr8/r;->c:Lp8/c;

    .line 9
    .line 10
    iput-object p4, p0, Lr8/r;->d:Lp8/g;

    .line 11
    .line 12
    iput-object p5, p0, Lr8/r;->e:Lr8/s;

    .line 13
    .line 14
    return-void
.end method

.method public static synthetic b(Ljava/lang/Exception;)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public a(Lp8/d;)V
    .locals 1

    .line 1
    new-instance v0, Lr8/q;

    .line 2
    .line 3
    invoke-direct {v0}, Lr8/q;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1, v0}, Lr8/r;->c(Lp8/d;Lp8/j;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public c(Lp8/d;Lp8/j;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lr8/r;->e:Lr8/s;

    .line 2
    .line 3
    invoke-static {}, Lr8/n;->a()Lr8/n$a;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, p0, Lr8/r;->a:Lr8/o;

    .line 8
    .line 9
    invoke-virtual {v1, v2}, Lr8/n$a;->e(Lr8/o;)Lr8/n$a;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1, p1}, Lr8/n$a;->c(Lp8/d;)Lr8/n$a;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget-object v1, p0, Lr8/r;->b:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {p1, v1}, Lr8/n$a;->f(Ljava/lang/String;)Lr8/n$a;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iget-object v1, p0, Lr8/r;->d:Lp8/g;

    .line 24
    .line 25
    invoke-virtual {p1, v1}, Lr8/n$a;->d(Lp8/g;)Lr8/n$a;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iget-object v1, p0, Lr8/r;->c:Lp8/c;

    .line 30
    .line 31
    invoke-virtual {p1, v1}, Lr8/n$a;->b(Lp8/c;)Lr8/n$a;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p1}, Lr8/n$a;->a()Lr8/n;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-interface {v0, p1, p2}, Lr8/s;->a(Lr8/n;Lp8/j;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method
