.class final synthetic Lmf/X$a;
.super Lkotlin/jvm/internal/F;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmf/X;->y(Lmf/X;LSe/r;I)Lye/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# static fields
.field public static final b:Lmf/X$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lmf/X$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lmf/X$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lmf/X$a;->b:Lmf/X$a;

    .line 7
    .line 8
    return-void
.end method

.method constructor <init>()V
    .locals 4

    .line 1
    const-string v0, "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-class v2, LXe/b;

    .line 5
    .line 6
    const-string v3, "outerClassId"

    .line 7
    .line 8
    invoke-direct {p0, v2, v3, v0, v1}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LXe/b;

    .line 2
    .line 3
    invoke-virtual {p1}, LXe/b;->e()LXe/b;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
