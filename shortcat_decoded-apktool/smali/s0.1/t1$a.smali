.class public final Ls0/t1$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ls0/E1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls0/t1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(JLi1/t;Li1/d;)Ls0/i1$b;
    .locals 0

    .line 1
    new-instance p3, Ls0/i1$b;

    .line 2
    .line 3
    invoke-static {p1, p2}, Lr0/m;->c(J)Lr0/h;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-direct {p3, p1}, Ls0/i1$b;-><init>(Lr0/h;)V

    .line 8
    .line 9
    .line 10
    return-object p3
.end method

.method public bridge synthetic createOutline-Pq9zytI(JLi1/t;Li1/d;)Ls0/i1;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Ls0/t1$a;->a(JLi1/t;Li1/d;)Ls0/i1$b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "RectangleShape"

    .line 2
    .line 3
    return-object v0
.end method
