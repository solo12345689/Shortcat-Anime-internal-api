.class final Landroidx/fragment/app/D$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:Landroidx/fragment/app/K$l;

.field private final b:Z


# direct methods
.method public constructor <init>(Landroidx/fragment/app/K$l;Z)V
    .locals 1

    .line 1
    const-string v0, "callback"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Landroidx/fragment/app/D$a;->a:Landroidx/fragment/app/K$l;

    .line 10
    .line 11
    iput-boolean p2, p0, Landroidx/fragment/app/D$a;->b:Z

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a()Landroidx/fragment/app/K$l;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/D$a;->a:Landroidx/fragment/app/K$l;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/fragment/app/D$a;->b:Z

    .line 2
    .line 3
    return v0
.end method
