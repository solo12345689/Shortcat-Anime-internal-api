.class public final LDf/l$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LDf/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:LDf/l;


# direct methods
.method public constructor <init>(LDf/l;)V
    .locals 1

    .line 1
    const-string v0, "match"

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
    iput-object p1, p0, LDf/l$b;->a:LDf/l;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a()LDf/l;
    .locals 1

    .line 1
    iget-object v0, p0, LDf/l$b;->a:LDf/l;

    .line 2
    .line 3
    return-object v0
.end method
