.class public final Lcom/facebook/react/uimanager/m0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/uimanager/m0$a;
    }
.end annotation


# static fields
.field public static final c:Lcom/facebook/react/uimanager/m0$a;

.field public static d:Ljava/util/Comparator;


# instance fields
.field public final a:I

.field public final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/uimanager/m0$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/facebook/react/uimanager/m0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/uimanager/m0;->c:Lcom/facebook/react/uimanager/m0$a;

    .line 8
    .line 9
    new-instance v0, Lcom/facebook/react/uimanager/l0;

    .line 10
    .line 11
    invoke-direct {v0}, Lcom/facebook/react/uimanager/l0;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lcom/facebook/react/uimanager/m0;->d:Ljava/util/Comparator;

    .line 15
    .line 16
    const-string v0, "ViewAtIndex"

    .line 17
    .line 18
    sget-object v1, LW6/a;->b:LW6/a;

    .line 19
    .line 20
    invoke-static {v0, v1}, LW6/b;->a(Ljava/lang/String;LW6/a;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public constructor <init>(II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/facebook/react/uimanager/m0;->a:I

    .line 5
    .line 6
    iput p2, p0, Lcom/facebook/react/uimanager/m0;->b:I

    .line 7
    .line 8
    return-void
.end method

.method public static synthetic a(Lcom/facebook/react/uimanager/m0;Lcom/facebook/react/uimanager/m0;)I
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/facebook/react/uimanager/m0;->b(Lcom/facebook/react/uimanager/m0;Lcom/facebook/react/uimanager/m0;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static final b(Lcom/facebook/react/uimanager/m0;Lcom/facebook/react/uimanager/m0;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/facebook/react/uimanager/m0;->b:I

    .line 2
    .line 3
    iget p1, p1, Lcom/facebook/react/uimanager/m0;->b:I

    .line 4
    .line 5
    sub-int/2addr p0, p1

    .line 6
    return p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    const-class v2, Lcom/facebook/react/uimanager/m0;

    .line 9
    .line 10
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    check-cast p1, Lcom/facebook/react/uimanager/m0;

    .line 18
    .line 19
    iget v1, p0, Lcom/facebook/react/uimanager/m0;->b:I

    .line 20
    .line 21
    iget v2, p1, Lcom/facebook/react/uimanager/m0;->b:I

    .line 22
    .line 23
    if-ne v1, v2, :cond_1

    .line 24
    .line 25
    iget v1, p0, Lcom/facebook/react/uimanager/m0;->a:I

    .line 26
    .line 27
    iget p1, p1, Lcom/facebook/react/uimanager/m0;->a:I

    .line 28
    .line 29
    if-ne v1, p1, :cond_1

    .line 30
    .line 31
    const/4 p1, 0x1

    .line 32
    return p1

    .line 33
    :cond_1
    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget v0, p0, Lcom/facebook/react/uimanager/m0;->a:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v1, p0, Lcom/facebook/react/uimanager/m0;->b:I

    .line 8
    .line 9
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    filled-new-array {v0, v1}, [Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget v0, p0, Lcom/facebook/react/uimanager/m0;->a:I

    .line 2
    .line 3
    iget v1, p0, Lcom/facebook/react/uimanager/m0;->b:I

    .line 4
    .line 5
    new-instance v2, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v3, "["

    .line 11
    .line 12
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v0, ", "

    .line 19
    .line 20
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v0, "]"

    .line 27
    .line 28
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    return-object v0
.end method
