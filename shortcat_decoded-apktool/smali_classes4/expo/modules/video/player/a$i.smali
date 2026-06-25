.class public final Lexpo/modules/video/player/a$i;
.super Lexpo/modules/video/player/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lexpo/modules/video/player/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "i"
.end annotation


# instance fields
.field private final d:Ljava/lang/String;

.field private final e:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lexpo/modules/video/player/a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    .line 4
    .line 5
    const-string v0, "renderFirstFrame"

    .line 6
    .line 7
    iput-object v0, p0, Lexpo/modules/video/player/a$i;->d:Ljava/lang/String;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public b()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lexpo/modules/video/player/a$i;->e:Z

    .line 2
    .line 3
    return v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/video/player/a$i;->d:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
