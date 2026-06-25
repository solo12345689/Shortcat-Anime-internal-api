.class Lq5/g$U;
.super Lq5/g$Y;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lq5/g$X;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq5/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "U"
.end annotation


# instance fields
.field o:Ljava/lang/String;

.field private p:Lq5/g$b0;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lq5/g$Y;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public d()Lq5/g$b0;
    .locals 1

    .line 1
    iget-object v0, p0, Lq5/g$U;->p:Lq5/g$b0;

    .line 2
    .line 3
    return-object v0
.end method

.method o()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "tref"

    .line 2
    .line 3
    return-object v0
.end method

.method public p(Lq5/g$b0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lq5/g$U;->p:Lq5/g$b0;

    .line 2
    .line 3
    return-void
.end method
