.class LP9/d$k$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP9/d$k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final a:Ljava/util/Iterator;

.field final b:Ljava/util/Collection;

.field final synthetic c:LP9/d$k;


# direct methods
.method constructor <init>(LP9/d$k;)V
    .locals 0

    .line 1
    iput-object p1, p0, LP9/d$k$a;->c:LP9/d$k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iget-object p1, p1, LP9/d$k;->b:Ljava/util/Collection;

    iput-object p1, p0, LP9/d$k$a;->b:Ljava/util/Collection;

    .line 3
    invoke-static {p1}, LP9/d;->l(Ljava/util/Collection;)Ljava/util/Iterator;

    move-result-object p1

    iput-object p1, p0, LP9/d$k$a;->a:Ljava/util/Iterator;

    return-void
.end method

.method constructor <init>(LP9/d$k;Ljava/util/Iterator;)V
    .locals 0

    .line 4
    iput-object p1, p0, LP9/d$k$a;->c:LP9/d$k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iget-object p1, p1, LP9/d$k;->b:Ljava/util/Collection;

    iput-object p1, p0, LP9/d$k$a;->b:Ljava/util/Collection;

    .line 6
    iput-object p2, p0, LP9/d$k$a;->a:Ljava/util/Iterator;

    return-void
.end method


# virtual methods
.method b()Ljava/util/Iterator;
    .locals 1

    .line 1
    invoke-virtual {p0}, LP9/d$k$a;->c()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LP9/d$k$a;->a:Ljava/util/Iterator;

    .line 5
    .line 6
    return-object v0
.end method

.method c()V
    .locals 2

    .line 1
    iget-object v0, p0, LP9/d$k$a;->c:LP9/d$k;

    .line 2
    .line 3
    invoke-virtual {v0}, LP9/d$k;->f()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LP9/d$k$a;->c:LP9/d$k;

    .line 7
    .line 8
    iget-object v0, v0, LP9/d$k;->b:Ljava/util/Collection;

    .line 9
    .line 10
    iget-object v1, p0, LP9/d$k$a;->b:Ljava/util/Collection;

    .line 11
    .line 12
    if-ne v0, v1, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    .line 18
    .line 19
    .line 20
    throw v0
.end method

.method public hasNext()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, LP9/d$k$a;->c()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LP9/d$k$a;->a:Ljava/util/Iterator;

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LP9/d$k$a;->c()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LP9/d$k$a;->a:Ljava/util/Iterator;

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0
.end method

.method public remove()V
    .locals 1

    .line 1
    iget-object v0, p0, LP9/d$k$a;->a:Ljava/util/Iterator;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LP9/d$k$a;->c:LP9/d$k;

    .line 7
    .line 8
    iget-object v0, v0, LP9/d$k;->e:LP9/d;

    .line 9
    .line 10
    invoke-static {v0}, LP9/d;->o(LP9/d;)I

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, LP9/d$k$a;->c:LP9/d$k;

    .line 14
    .line 15
    invoke-virtual {v0}, LP9/d$k;->i()V

    .line 16
    .line 17
    .line 18
    return-void
.end method
