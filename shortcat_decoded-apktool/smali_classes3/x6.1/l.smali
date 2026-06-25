.class public Lx6/l;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lx6/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(Ly5/n;LB5/d;Lx6/x$a;ZZLx6/n$b;)Lx6/n;
    .locals 7

    .line 1
    new-instance v1, Lx6/l$a;

    .line 2
    .line 3
    invoke-direct {v1, p0}, Lx6/l$a;-><init>(Lx6/l;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lx6/w;

    .line 7
    .line 8
    move-object v3, p1

    .line 9
    move-object v2, p3

    .line 10
    move v5, p4

    .line 11
    move v6, p5

    .line 12
    move-object v4, p6

    .line 13
    invoke-direct/range {v0 .. v6}, Lx6/w;-><init>(Lx6/D;Lx6/x$a;Ly5/n;Lx6/n$b;ZZ)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p2, v0}, LB5/d;->a(LB5/c;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method
