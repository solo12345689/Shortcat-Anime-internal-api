.class LH9/h$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LH9/m$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH9/h;-><init>(LH9/h$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LH9/h;


# direct methods
.method constructor <init>(LH9/h;)V
    .locals 0

    .line 1
    iput-object p1, p0, LH9/h$b;->a:LH9/h;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(LH9/n;Landroid/graphics/Matrix;I)V
    .locals 3

    .line 1
    iget-object v0, p0, LH9/h$b;->a:LH9/h;

    .line 2
    .line 3
    invoke-static {v0}, LH9/h;->c(LH9/h;)Ljava/util/BitSet;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    add-int/lit8 v1, p3, 0x4

    .line 8
    .line 9
    invoke-virtual {p1}, LH9/n;->e()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-virtual {v0, v1, v2}, Ljava/util/BitSet;->set(IZ)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, LH9/h$b;->a:LH9/h;

    .line 17
    .line 18
    invoke-static {v0}, LH9/h;->e(LH9/h;)[LH9/n$g;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {p1, p2}, LH9/n;->f(Landroid/graphics/Matrix;)LH9/n$g;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    aput-object p1, v0, p3

    .line 27
    .line 28
    return-void
.end method

.method public b(LH9/n;Landroid/graphics/Matrix;I)V
    .locals 2

    .line 1
    iget-object v0, p0, LH9/h$b;->a:LH9/h;

    .line 2
    .line 3
    invoke-static {v0}, LH9/h;->c(LH9/h;)Ljava/util/BitSet;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p1}, LH9/n;->e()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-virtual {v0, p3, v1}, Ljava/util/BitSet;->set(IZ)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, LH9/h$b;->a:LH9/h;

    .line 15
    .line 16
    invoke-static {v0}, LH9/h;->d(LH9/h;)[LH9/n$g;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {p1, p2}, LH9/n;->f(Landroid/graphics/Matrix;)LH9/n$g;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    aput-object p1, v0, p3

    .line 25
    .line 26
    return-void
.end method
