.class public final LLe/G$b$a;
.super LLe/G$b;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LLe/G$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Lye/e;


# direct methods
.method public constructor <init>(Lye/e;)V
    .locals 1

    .line 1
    const-string v0, "descriptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-direct {p0, v0}, LLe/G$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, LLe/G$b$a;->a:Lye/e;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a()Lye/e;
    .locals 1

    .line 1
    iget-object v0, p0, LLe/G$b$a;->a:Lye/e;

    .line 2
    .line 3
    return-object v0
.end method
