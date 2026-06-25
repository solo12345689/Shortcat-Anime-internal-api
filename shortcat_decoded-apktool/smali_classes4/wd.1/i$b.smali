.class final enum Lwd/i$b;
.super Ljava/lang/Enum;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwd/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "b"
.end annotation


# static fields
.field public static final enum a:Lwd/i$b;

.field public static final enum b:Lwd/i$b;

.field public static final enum c:Lwd/i$b;

.field private static final synthetic d:[Lwd/i$b;

.field private static final synthetic e:Lkotlin/enums/EnumEntries;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lwd/i$b;

    .line 2
    .line 3
    const-string v1, "FINISHED"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lwd/i$b;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lwd/i$b;->a:Lwd/i$b;

    .line 10
    .line 11
    new-instance v0, Lwd/i$b;

    .line 12
    .line 13
    const-string v1, "ALREADY_EXISTS"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Lwd/i$b;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lwd/i$b;->b:Lwd/i$b;

    .line 20
    .line 21
    new-instance v0, Lwd/i$b;

    .line 22
    .line 23
    const-string v1, "ERRORED"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2}, Lwd/i$b;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lwd/i$b;->c:Lwd/i$b;

    .line 30
    .line 31
    invoke-static {}, Lwd/i$b;->a()[Lwd/i$b;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Lwd/i$b;->d:[Lwd/i$b;

    .line 36
    .line 37
    invoke-static {v0}, Lbe/a;->a([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sput-object v0, Lwd/i$b;->e:Lkotlin/enums/EnumEntries;

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

.method private static final synthetic a()[Lwd/i$b;
    .locals 3

    .line 1
    sget-object v0, Lwd/i$b;->a:Lwd/i$b;

    .line 2
    .line 3
    sget-object v1, Lwd/i$b;->b:Lwd/i$b;

    .line 4
    .line 5
    sget-object v2, Lwd/i$b;->c:Lwd/i$b;

    .line 6
    .line 7
    filled-new-array {v0, v1, v2}, [Lwd/i$b;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lwd/i$b;
    .locals 1

    .line 1
    const-class v0, Lwd/i$b;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lwd/i$b;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lwd/i$b;
    .locals 1

    .line 1
    sget-object v0, Lwd/i$b;->d:[Lwd/i$b;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lwd/i$b;

    .line 8
    .line 9
    return-object v0
.end method
