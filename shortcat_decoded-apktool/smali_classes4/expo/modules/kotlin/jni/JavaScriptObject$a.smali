.class public final enum Lexpo/modules/kotlin/jni/JavaScriptObject$a;
.super Ljava/lang/Enum;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lexpo/modules/kotlin/jni/JavaScriptObject;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field public static final enum b:Lexpo/modules/kotlin/jni/JavaScriptObject$a;

.field public static final enum c:Lexpo/modules/kotlin/jni/JavaScriptObject$a;

.field public static final enum d:Lexpo/modules/kotlin/jni/JavaScriptObject$a;

.field private static final synthetic e:[Lexpo/modules/kotlin/jni/JavaScriptObject$a;

.field private static final synthetic f:Lkotlin/enums/EnumEntries;


# instance fields
.field private final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lexpo/modules/kotlin/jni/JavaScriptObject$a;

    .line 2
    .line 3
    const-string v1, "Configurable"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    invoke-direct {v0, v1, v2, v3}, Lexpo/modules/kotlin/jni/JavaScriptObject$a;-><init>(Ljava/lang/String;II)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lexpo/modules/kotlin/jni/JavaScriptObject$a;->b:Lexpo/modules/kotlin/jni/JavaScriptObject$a;

    .line 11
    .line 12
    new-instance v0, Lexpo/modules/kotlin/jni/JavaScriptObject$a;

    .line 13
    .line 14
    const-string v1, "Enumerable"

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    invoke-direct {v0, v1, v3, v2}, Lexpo/modules/kotlin/jni/JavaScriptObject$a;-><init>(Ljava/lang/String;II)V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lexpo/modules/kotlin/jni/JavaScriptObject$a;->c:Lexpo/modules/kotlin/jni/JavaScriptObject$a;

    .line 21
    .line 22
    new-instance v0, Lexpo/modules/kotlin/jni/JavaScriptObject$a;

    .line 23
    .line 24
    const-string v1, "Writable"

    .line 25
    .line 26
    const/4 v3, 0x4

    .line 27
    invoke-direct {v0, v1, v2, v3}, Lexpo/modules/kotlin/jni/JavaScriptObject$a;-><init>(Ljava/lang/String;II)V

    .line 28
    .line 29
    .line 30
    sput-object v0, Lexpo/modules/kotlin/jni/JavaScriptObject$a;->d:Lexpo/modules/kotlin/jni/JavaScriptObject$a;

    .line 31
    .line 32
    invoke-static {}, Lexpo/modules/kotlin/jni/JavaScriptObject$a;->a()[Lexpo/modules/kotlin/jni/JavaScriptObject$a;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    sput-object v0, Lexpo/modules/kotlin/jni/JavaScriptObject$a;->e:[Lexpo/modules/kotlin/jni/JavaScriptObject$a;

    .line 37
    .line 38
    invoke-static {v0}, Lbe/a;->a([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    sput-object v0, Lexpo/modules/kotlin/jni/JavaScriptObject$a;->f:Lkotlin/enums/EnumEntries;

    .line 43
    .line 44
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lexpo/modules/kotlin/jni/JavaScriptObject$a;->a:I

    .line 5
    .line 6
    return-void
.end method

.method private static final synthetic a()[Lexpo/modules/kotlin/jni/JavaScriptObject$a;
    .locals 3

    .line 1
    sget-object v0, Lexpo/modules/kotlin/jni/JavaScriptObject$a;->b:Lexpo/modules/kotlin/jni/JavaScriptObject$a;

    .line 2
    .line 3
    sget-object v1, Lexpo/modules/kotlin/jni/JavaScriptObject$a;->c:Lexpo/modules/kotlin/jni/JavaScriptObject$a;

    .line 4
    .line 5
    sget-object v2, Lexpo/modules/kotlin/jni/JavaScriptObject$a;->d:Lexpo/modules/kotlin/jni/JavaScriptObject$a;

    .line 6
    .line 7
    filled-new-array {v0, v1, v2}, [Lexpo/modules/kotlin/jni/JavaScriptObject$a;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lexpo/modules/kotlin/jni/JavaScriptObject$a;
    .locals 1

    .line 1
    const-class v0, Lexpo/modules/kotlin/jni/JavaScriptObject$a;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lexpo/modules/kotlin/jni/JavaScriptObject$a;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lexpo/modules/kotlin/jni/JavaScriptObject$a;
    .locals 1

    .line 1
    sget-object v0, Lexpo/modules/kotlin/jni/JavaScriptObject$a;->e:[Lexpo/modules/kotlin/jni/JavaScriptObject$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lexpo/modules/kotlin/jni/JavaScriptObject$a;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final b()I
    .locals 1

    .line 1
    iget v0, p0, Lexpo/modules/kotlin/jni/JavaScriptObject$a;->a:I

    .line 2
    .line 3
    return v0
.end method
