.class Lh5/m$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lh5/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh5/m;->b(Landroid/content/Context;Lcom/bumptech/glide/b;Landroidx/lifecycle/k;Landroidx/fragment/app/K;Z)Lcom/bumptech/glide/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/lifecycle/k;

.field final synthetic b:Lh5/m;


# direct methods
.method constructor <init>(Lh5/m;Landroidx/lifecycle/k;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lh5/m$a;->b:Lh5/m;

    .line 2
    .line 3
    iput-object p2, p0, Lh5/m$a;->a:Landroidx/lifecycle/k;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    .line 1
    return-void
.end method

.method public b()V
    .locals 0

    .line 1
    return-void
.end method

.method public d()V
    .locals 2

    .line 1
    iget-object v0, p0, Lh5/m$a;->b:Lh5/m;

    .line 2
    .line 3
    iget-object v0, v0, Lh5/m;->a:Ljava/util/Map;

    .line 4
    .line 5
    iget-object v1, p0, Lh5/m$a;->a:Landroidx/lifecycle/k;

    .line 6
    .line 7
    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    return-void
.end method
