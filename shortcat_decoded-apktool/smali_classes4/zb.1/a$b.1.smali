.class public final enum Lzb/a$b;
.super Ljava/lang/Enum;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzb/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation


# static fields
.field public static final enum b:Lzb/a$b;

.field public static final enum c:Lzb/a$b;

.field public static final enum d:Lzb/a$b;

.field public static final enum e:Lzb/a$b;

.field public static final enum f:Lzb/a$b;

.field private static final synthetic g:[Lzb/a$b;

.field private static final synthetic h:Lkotlin/enums/EnumEntries;


# instance fields
.field private final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lzb/a$b;

    .line 2
    .line 3
    const-string v1, "UNKNOWN"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v2}, Lzb/a$b;-><init>(Ljava/lang/String;II)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lzb/a$b;->b:Lzb/a$b;

    .line 10
    .line 11
    new-instance v0, Lzb/a$b;

    .line 12
    .line 13
    const-string v1, "PHONE"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2, v2}, Lzb/a$b;-><init>(Ljava/lang/String;II)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lzb/a$b;->c:Lzb/a$b;

    .line 20
    .line 21
    new-instance v0, Lzb/a$b;

    .line 22
    .line 23
    const-string v1, "TABLET"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2, v2}, Lzb/a$b;-><init>(Ljava/lang/String;II)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lzb/a$b;->d:Lzb/a$b;

    .line 30
    .line 31
    new-instance v0, Lzb/a$b;

    .line 32
    .line 33
    const-string v1, "DESKTOP"

    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    invoke-direct {v0, v1, v2, v2}, Lzb/a$b;-><init>(Ljava/lang/String;II)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lzb/a$b;->e:Lzb/a$b;

    .line 40
    .line 41
    new-instance v0, Lzb/a$b;

    .line 42
    .line 43
    const-string v1, "TV"

    .line 44
    .line 45
    const/4 v2, 0x4

    .line 46
    invoke-direct {v0, v1, v2, v2}, Lzb/a$b;-><init>(Ljava/lang/String;II)V

    .line 47
    .line 48
    .line 49
    sput-object v0, Lzb/a$b;->f:Lzb/a$b;

    .line 50
    .line 51
    invoke-static {}, Lzb/a$b;->a()[Lzb/a$b;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    sput-object v0, Lzb/a$b;->g:[Lzb/a$b;

    .line 56
    .line 57
    invoke-static {v0}, Lbe/a;->a([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    sput-object v0, Lzb/a$b;->h:Lkotlin/enums/EnumEntries;

    .line 62
    .line 63
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lzb/a$b;->a:I

    .line 5
    .line 6
    return-void
.end method

.method private static final synthetic a()[Lzb/a$b;
    .locals 5

    .line 1
    sget-object v0, Lzb/a$b;->b:Lzb/a$b;

    .line 2
    .line 3
    sget-object v1, Lzb/a$b;->c:Lzb/a$b;

    .line 4
    .line 5
    sget-object v2, Lzb/a$b;->d:Lzb/a$b;

    .line 6
    .line 7
    sget-object v3, Lzb/a$b;->e:Lzb/a$b;

    .line 8
    .line 9
    sget-object v4, Lzb/a$b;->f:Lzb/a$b;

    .line 10
    .line 11
    filled-new-array {v0, v1, v2, v3, v4}, [Lzb/a$b;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lzb/a$b;
    .locals 1

    .line 1
    const-class v0, Lzb/a$b;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lzb/a$b;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lzb/a$b;
    .locals 1

    .line 1
    sget-object v0, Lzb/a$b;->g:[Lzb/a$b;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lzb/a$b;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final b()I
    .locals 1

    .line 1
    iget v0, p0, Lzb/a$b;->a:I

    .line 2
    .line 3
    return v0
.end method
