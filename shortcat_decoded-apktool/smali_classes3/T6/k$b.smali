.class final enum LT6/k$b;
.super Ljava/lang/Enum;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LT6/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "b"
.end annotation


# static fields
.field public static final enum a:LT6/k$b;

.field public static final enum b:LT6/k$b;

.field public static final enum c:LT6/k$b;

.field private static final synthetic d:[LT6/k$b;

.field private static final synthetic e:Lkotlin/enums/EnumEntries;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LT6/k$b;

    .line 2
    .line 3
    const-string v1, "Number"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, LT6/k$b;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, LT6/k$b;->a:LT6/k$b;

    .line 10
    .line 11
    new-instance v0, LT6/k$b;

    .line 12
    .line 13
    const-string v1, "Color"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, LT6/k$b;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, LT6/k$b;->b:LT6/k$b;

    .line 20
    .line 21
    new-instance v0, LT6/k$b;

    .line 22
    .line 23
    const-string v1, "String"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2}, LT6/k$b;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, LT6/k$b;->c:LT6/k$b;

    .line 30
    .line 31
    invoke-static {}, LT6/k$b;->a()[LT6/k$b;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, LT6/k$b;->d:[LT6/k$b;

    .line 36
    .line 37
    invoke-static {v0}, Lbe/a;->a([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sput-object v0, LT6/k$b;->e:Lkotlin/enums/EnumEntries;

    .line 42
    .line 43
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final synthetic a()[LT6/k$b;
    .locals 3

    .line 1
    sget-object v0, LT6/k$b;->a:LT6/k$b;

    .line 2
    .line 3
    sget-object v1, LT6/k$b;->b:LT6/k$b;

    .line 4
    .line 5
    sget-object v2, LT6/k$b;->c:LT6/k$b;

    .line 6
    .line 7
    filled-new-array {v0, v1, v2}, [LT6/k$b;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LT6/k$b;
    .locals 1

    .line 1
    const-class v0, LT6/k$b;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LT6/k$b;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[LT6/k$b;
    .locals 1

    .line 1
    sget-object v0, LT6/k$b;->d:[LT6/k$b;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [LT6/k$b;

    .line 8
    .line 9
    return-object v0
.end method
