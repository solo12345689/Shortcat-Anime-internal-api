.class public final Ls0/i1$a;
.super Ls0/i1;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls0/i1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Ls0/m1;


# direct methods
.method public constructor <init>(Ls0/m1;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Ls0/i1;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, Ls0/i1$a;->a:Ls0/m1;

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public a()Lr0/h;
    .locals 1

    .line 1
    iget-object v0, p0, Ls0/i1$a;->a:Ls0/m1;

    .line 2
    .line 3
    invoke-interface {v0}, Ls0/m1;->getBounds()Lr0/h;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final b()Ls0/m1;
    .locals 1

    .line 1
    iget-object v0, p0, Ls0/i1$a;->a:Ls0/m1;

    .line 2
    .line 3
    return-object v0
.end method
