.class public final synthetic Landroidx/fragment/app/I;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LP3/f$b;


# instance fields
.field public final synthetic a:Landroidx/fragment/app/K;


# direct methods
.method public synthetic constructor <init>(Landroidx/fragment/app/K;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/fragment/app/I;->a:Landroidx/fragment/app/K;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()Landroid/os/Bundle;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/I;->a:Landroidx/fragment/app/K;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/fragment/app/K;->b(Landroidx/fragment/app/K;)Landroid/os/Bundle;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
