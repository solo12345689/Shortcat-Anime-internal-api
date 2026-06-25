.class public final Lsg/d$g;
.super Lig/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsg/d;->r(Ljava/lang/String;Lsg/d$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic e:Lsg/d;

.field final synthetic f:J


# direct methods
.method public constructor <init>(Ljava/lang/String;Lsg/d;J)V
    .locals 0

    .line 1
    iput-object p2, p0, Lsg/d$g;->e:Lsg/d;

    .line 2
    .line 3
    iput-wide p3, p0, Lsg/d$g;->f:J

    .line 4
    .line 5
    const/4 p2, 0x2

    .line 6
    const/4 p3, 0x0

    .line 7
    const/4 p4, 0x0

    .line 8
    invoke-direct {p0, p1, p4, p2, p3}, Lig/a;-><init>(Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public f()J
    .locals 2

    .line 1
    iget-object v0, p0, Lsg/d$g;->e:Lsg/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lsg/d;->x()V

    .line 4
    .line 5
    .line 6
    iget-wide v0, p0, Lsg/d$g;->f:J

    .line 7
    .line 8
    return-wide v0
.end method
