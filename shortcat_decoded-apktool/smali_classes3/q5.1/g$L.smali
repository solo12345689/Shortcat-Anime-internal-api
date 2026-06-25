.class abstract Lq5/g$L;
.super Lq5/g$N;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq5/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "L"
.end annotation


# instance fields
.field c:Ljava/lang/String;

.field d:Ljava/lang/Boolean;

.field e:Lq5/g$E;

.field f:Lq5/g$E;

.field g:Ljava/util/List;


# direct methods
.method constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lq5/g$N;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lq5/g$L;->c:Ljava/lang/String;

    .line 6
    .line 7
    iput-object v0, p0, Lq5/g$L;->d:Ljava/lang/Boolean;

    .line 8
    .line 9
    iput-object v0, p0, Lq5/g$L;->e:Lq5/g$E;

    .line 10
    .line 11
    iput-object v0, p0, Lq5/g$L;->f:Lq5/g$E;

    .line 12
    .line 13
    iput-object v0, p0, Lq5/g$L;->g:Ljava/util/List;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lq5/g$N;->o()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
