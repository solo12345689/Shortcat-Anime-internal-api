.class final Ljg/f$c;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljg/f;->i(Ljg/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ldg/g;

.field final synthetic b:Ldg/s;

.field final synthetic c:Ldg/a;


# direct methods
.method constructor <init>(Ldg/g;Ldg/s;Ldg/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ljg/f$c;->a:Ldg/g;

    .line 2
    .line 3
    iput-object p2, p0, Ljg/f$c;->b:Ldg/s;

    .line 4
    .line 5
    iput-object p3, p0, Ljg/f$c;->c:Ldg/a;

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljg/f$c;->invoke()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()Ljava/util/List;
    .locals 3

    .line 2
    iget-object v0, p0, Ljg/f$c;->a:Ldg/g;

    invoke-virtual {v0}, Ldg/g;->d()Lrg/c;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    iget-object v1, p0, Ljg/f$c;->b:Ldg/s;

    invoke-virtual {v1}, Ldg/s;->d()Ljava/util/List;

    move-result-object v1

    .line 3
    iget-object v2, p0, Ljg/f$c;->c:Ldg/a;

    invoke-virtual {v2}, Ldg/a;->l()Ldg/u;

    move-result-object v2

    invoke-virtual {v2}, Ldg/u;->h()Ljava/lang/String;

    move-result-object v2

    .line 4
    invoke-virtual {v0, v1, v2}, Lrg/c;->a(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
