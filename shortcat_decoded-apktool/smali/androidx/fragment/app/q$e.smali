.class Landroidx/fragment/app/q$e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/q;->callStartTransitionListener(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/fragment/app/c0;

.field final synthetic b:Landroidx/fragment/app/q;


# direct methods
.method constructor <init>(Landroidx/fragment/app/q;Landroidx/fragment/app/c0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/fragment/app/q$e;->b:Landroidx/fragment/app/q;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/fragment/app/q$e;->a:Landroidx/fragment/app/c0;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/q$e;->a:Landroidx/fragment/app/c0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/c0;->y()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/fragment/app/q$e;->a:Landroidx/fragment/app/c0;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroidx/fragment/app/c0;->n()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method
