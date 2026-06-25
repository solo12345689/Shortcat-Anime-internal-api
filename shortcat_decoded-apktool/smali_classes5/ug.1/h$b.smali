.class final Lug/h$b;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lug/h;-><init>(Ljava/lang/ClassLoader;ZLtg/o;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lug/h;


# direct methods
.method constructor <init>(Lug/h;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lug/h$b;->a:Lug/h;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lug/h$b;->invoke()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()Ljava/util/List;
    .locals 2

    .line 2
    iget-object v0, p0, Lug/h$b;->a:Lug/h;

    invoke-static {v0}, Lug/h;->r(Lug/h;)Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-static {v0, v1}, Lug/h;->u(Lug/h;Ljava/lang/ClassLoader;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
