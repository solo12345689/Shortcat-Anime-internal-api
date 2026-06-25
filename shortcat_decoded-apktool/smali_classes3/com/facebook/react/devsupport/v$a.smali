.class final enum Lcom/facebook/react/devsupport/v$a;
.super Ljava/lang/Enum;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/devsupport/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "a"
.end annotation


# static fields
.field public static final enum b:Lcom/facebook/react/devsupport/v$a;

.field public static final enum c:Lcom/facebook/react/devsupport/v$a;

.field private static final synthetic d:[Lcom/facebook/react/devsupport/v$a;

.field private static final synthetic e:Lkotlin/enums/EnumEntries;


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/facebook/react/devsupport/v$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "bundle"

    .line 5
    .line 6
    const-string v3, "BUNDLE"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, Lcom/facebook/react/devsupport/v$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lcom/facebook/react/devsupport/v$a;->b:Lcom/facebook/react/devsupport/v$a;

    .line 12
    .line 13
    new-instance v0, Lcom/facebook/react/devsupport/v$a;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    const-string v2, "map"

    .line 17
    .line 18
    const-string v3, "MAP"

    .line 19
    .line 20
    invoke-direct {v0, v3, v1, v2}, Lcom/facebook/react/devsupport/v$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lcom/facebook/react/devsupport/v$a;->c:Lcom/facebook/react/devsupport/v$a;

    .line 24
    .line 25
    invoke-static {}, Lcom/facebook/react/devsupport/v$a;->a()[Lcom/facebook/react/devsupport/v$a;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sput-object v0, Lcom/facebook/react/devsupport/v$a;->d:[Lcom/facebook/react/devsupport/v$a;

    .line 30
    .line 31
    invoke-static {v0}, Lbe/a;->a([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Lcom/facebook/react/devsupport/v$a;->e:Lkotlin/enums/EnumEntries;

    .line 36
    .line 37
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lcom/facebook/react/devsupport/v$a;->a:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method private static final synthetic a()[Lcom/facebook/react/devsupport/v$a;
    .locals 2

    .line 1
    sget-object v0, Lcom/facebook/react/devsupport/v$a;->b:Lcom/facebook/react/devsupport/v$a;

    .line 2
    .line 3
    sget-object v1, Lcom/facebook/react/devsupport/v$a;->c:Lcom/facebook/react/devsupport/v$a;

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Lcom/facebook/react/devsupport/v$a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/react/devsupport/v$a;
    .locals 1

    .line 1
    const-class v0, Lcom/facebook/react/devsupport/v$a;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/facebook/react/devsupport/v$a;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lcom/facebook/react/devsupport/v$a;
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/devsupport/v$a;->d:[Lcom/facebook/react/devsupport/v$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/facebook/react/devsupport/v$a;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/v$a;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
