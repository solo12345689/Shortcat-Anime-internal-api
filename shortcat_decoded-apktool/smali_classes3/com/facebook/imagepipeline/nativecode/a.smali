.class public abstract Lcom/facebook/imagepipeline/nativecode/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final a:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Lcom/facebook/imagepipeline/nativecode/a;->a:Ljava/util/List;

    .line 11
    .line 12
    return-void
.end method

.method public static a()V
    .locals 1

    .line 1
    const-string v0, "imagepipeline"

    .line 2
    .line 3
    invoke-static {v0}, LR7/a;->d(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method
