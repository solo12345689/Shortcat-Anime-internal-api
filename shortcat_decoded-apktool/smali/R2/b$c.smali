.class final LR2/b$c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LQ2/m$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LR2/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation


# instance fields
.field private final a:LR2/b$b;


# direct methods
.method public constructor <init>(LR2/b$b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LR2/b$c;->a:LR2/b$b;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public h(LQ2/m$e;JJZ)V
    .locals 0

    .line 1
    return-void
.end method

.method public j(LQ2/m$e;JJ)V
    .locals 0

    .line 1
    iget-object p1, p0, LR2/b$c;->a:LR2/b$b;

    .line 2
    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    invoke-static {}, LR2/b;->m()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    iget-object p1, p0, LR2/b$c;->a:LR2/b$b;

    .line 12
    .line 13
    new-instance p2, Ljava/io/IOException;

    .line 14
    .line 15
    new-instance p3, Ljava/util/ConcurrentModificationException;

    .line 16
    .line 17
    invoke-direct {p3}, Ljava/util/ConcurrentModificationException;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-direct {p2, p3}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    invoke-interface {p1, p2}, LR2/b$b;->a(Ljava/io/IOException;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    iget-object p1, p0, LR2/b$c;->a:LR2/b$b;

    .line 28
    .line 29
    invoke-interface {p1}, LR2/b$b;->b()V

    .line 30
    .line 31
    .line 32
    :cond_1
    return-void
.end method

.method public n(LQ2/m$e;JJLjava/io/IOException;I)LQ2/m$c;
    .locals 0

    .line 1
    iget-object p1, p0, LR2/b$c;->a:LR2/b$b;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-interface {p1, p6}, LR2/b$b;->a(Ljava/io/IOException;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    sget-object p1, LQ2/m;->f:LQ2/m$c;

    .line 9
    .line 10
    return-object p1
.end method
