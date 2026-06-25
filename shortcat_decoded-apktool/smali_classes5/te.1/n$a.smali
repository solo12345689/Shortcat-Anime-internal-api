.class final Lte/n$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lte/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:Loe/f;

.field private final b:[Ljava/util/List;

.field private final c:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>(Loe/f;[Ljava/util/List;Ljava/lang/reflect/Method;)V
    .locals 1

    .line 1
    const-string v0, "argumentRange"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "unboxParameters"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lte/n$a;->a:Loe/f;

    .line 15
    .line 16
    iput-object p2, p0, Lte/n$a;->b:[Ljava/util/List;

    .line 17
    .line 18
    iput-object p3, p0, Lte/n$a;->c:Ljava/lang/reflect/Method;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final a()Loe/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lte/n$a;->a:Loe/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Ljava/lang/reflect/Method;
    .locals 1

    .line 1
    iget-object v0, p0, Lte/n$a;->c:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()[Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lte/n$a;->b:[Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method
