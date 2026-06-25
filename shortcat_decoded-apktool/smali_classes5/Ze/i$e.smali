.class final LZe/i$e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LZe/h$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LZe/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "e"
.end annotation


# instance fields
.field final a:LZe/j$b;

.field final b:I

.field final c:LZe/y$b;

.field final d:Z

.field final e:Z


# direct methods
.method constructor <init>(LZe/j$b;ILZe/y$b;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LZe/i$e;->a:LZe/j$b;

    .line 5
    .line 6
    iput p2, p0, LZe/i$e;->b:I

    .line 7
    .line 8
    iput-object p3, p0, LZe/i$e;->c:LZe/y$b;

    .line 9
    .line 10
    iput-boolean p4, p0, LZe/i$e;->d:Z

    .line 11
    .line 12
    iput-boolean p5, p0, LZe/i$e;->e:Z

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public a(LZe/i$e;)I
    .locals 1

    .line 1
    iget v0, p0, LZe/i$e;->b:I

    .line 2
    .line 3
    iget p1, p1, LZe/i$e;->b:I

    .line 4
    .line 5
    sub-int/2addr v0, p1

    .line 6
    return v0
.end method

.method public b()LZe/j$b;
    .locals 1

    .line 1
    iget-object v0, p0, LZe/i$e;->a:LZe/j$b;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, LZe/i$e;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LZe/i$e;->a(LZe/i$e;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public d()I
    .locals 1

    .line 1
    iget v0, p0, LZe/i$e;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public e()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LZe/i$e;->d:Z

    .line 2
    .line 3
    return v0
.end method

.method public f()LZe/y$b;
    .locals 1

    .line 1
    iget-object v0, p0, LZe/i$e;->c:LZe/y$b;

    .line 2
    .line 3
    return-object v0
.end method

.method public g()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LZe/i$e;->e:Z

    .line 2
    .line 3
    return v0
.end method

.method public i(LZe/p$a;LZe/p;)LZe/p$a;
    .locals 0

    .line 1
    check-cast p1, LZe/i$b;

    .line 2
    .line 3
    check-cast p2, LZe/i;

    .line 4
    .line 5
    invoke-virtual {p1, p2}, LZe/i$b;->j(LZe/i;)LZe/i$b;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public o()LZe/y$c;
    .locals 1

    .line 1
    iget-object v0, p0, LZe/i$e;->c:LZe/y$b;

    .line 2
    .line 3
    invoke-virtual {v0}, LZe/y$b;->a()LZe/y$c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
