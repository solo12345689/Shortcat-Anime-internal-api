.class public final LH7/e$b;
.super LH7/e;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LH7/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final b:LH7/f;


# direct methods
.method public constructor <init>(LH7/f;)V
    .locals 1

    .line 1
    const-string v0, "lengthPercentage"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-direct {p0, v0}, LH7/e;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, LH7/e$b;->b:LH7/f;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a()LH7/f;
    .locals 1

    .line 1
    iget-object v0, p0, LH7/e$b;->b:LH7/f;

    .line 2
    .line 3
    return-object v0
.end method
