.class final Lcoil/compose/c$b;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcoil/compose/c;->h(Lw0/b;Lw0/b;Lw0/b;)Lkotlin/jvm/functions/Function1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lw0/b;

.field final synthetic b:Lw0/b;

.field final synthetic c:Lw0/b;


# direct methods
.method constructor <init>(Lw0/b;Lw0/b;Lw0/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcoil/compose/c$b;->a:Lw0/b;

    .line 2
    .line 3
    iput-object p2, p0, Lcoil/compose/c$b;->b:Lw0/b;

    .line 4
    .line 5
    iput-object p3, p0, Lcoil/compose/c$b;->c:Lw0/b;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(Lcoil/compose/AsyncImagePainter$State;)Lcoil/compose/AsyncImagePainter$State;
    .locals 3

    .line 1
    instance-of v0, p1, Lcoil/compose/AsyncImagePainter$State$Loading;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcoil/compose/c$b;->a:Lw0/b;

    .line 6
    .line 7
    check-cast p1, Lcoil/compose/AsyncImagePainter$State$Loading;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Lcoil/compose/AsyncImagePainter$State$Loading;->b(Lw0/b;)Lcoil/compose/AsyncImagePainter$State$Loading;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    :cond_0
    return-object p1

    .line 16
    :cond_1
    instance-of v0, p1, Lcoil/compose/AsyncImagePainter$State$Error;

    .line 17
    .line 18
    if-eqz v0, :cond_3

    .line 19
    .line 20
    check-cast p1, Lcoil/compose/AsyncImagePainter$State$Error;

    .line 21
    .line 22
    invoke-virtual {p1}, Lcoil/compose/AsyncImagePainter$State$Error;->d()LG4/f;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0}, LG4/f;->c()Ljava/lang/Throwable;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    instance-of v0, v0, LG4/k;

    .line 31
    .line 32
    const/4 v1, 0x2

    .line 33
    const/4 v2, 0x0

    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    iget-object v0, p0, Lcoil/compose/c$b;->b:Lw0/b;

    .line 37
    .line 38
    if-eqz v0, :cond_3

    .line 39
    .line 40
    invoke-static {p1, v0, v2, v1, v2}, Lcoil/compose/AsyncImagePainter$State$Error;->c(Lcoil/compose/AsyncImagePainter$State$Error;Lw0/b;LG4/f;ILjava/lang/Object;)Lcoil/compose/AsyncImagePainter$State$Error;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    return-object p1

    .line 45
    :cond_2
    iget-object v0, p0, Lcoil/compose/c$b;->c:Lw0/b;

    .line 46
    .line 47
    if-eqz v0, :cond_3

    .line 48
    .line 49
    invoke-static {p1, v0, v2, v1, v2}, Lcoil/compose/AsyncImagePainter$State$Error;->c(Lcoil/compose/AsyncImagePainter$State$Error;Lw0/b;LG4/f;ILjava/lang/Object;)Lcoil/compose/AsyncImagePainter$State$Error;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    :cond_3
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcoil/compose/AsyncImagePainter$State;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcoil/compose/c$b;->a(Lcoil/compose/AsyncImagePainter$State;)Lcoil/compose/AsyncImagePainter$State;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
