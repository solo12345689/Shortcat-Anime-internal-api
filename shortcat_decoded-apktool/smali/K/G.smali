.class public final enum LK/G;
.super Ljava/lang/Enum;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final enum b:LK/G;

.field public static final enum c:LK/G;

.field public static final enum d:LK/G;

.field public static final enum e:LK/G;

.field private static final synthetic f:[LK/G;


# instance fields
.field private final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, LK/G;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const v2, 0x1040003

    .line 5
    .line 6
    .line 7
    const-string v3, "Cut"

    .line 8
    .line 9
    invoke-direct {v0, v3, v1, v2}, LK/G;-><init>(Ljava/lang/String;II)V

    .line 10
    .line 11
    .line 12
    sput-object v0, LK/G;->b:LK/G;

    .line 13
    .line 14
    new-instance v0, LK/G;

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    const v2, 0x1040001

    .line 18
    .line 19
    .line 20
    const-string v3, "Copy"

    .line 21
    .line 22
    invoke-direct {v0, v3, v1, v2}, LK/G;-><init>(Ljava/lang/String;II)V

    .line 23
    .line 24
    .line 25
    sput-object v0, LK/G;->c:LK/G;

    .line 26
    .line 27
    new-instance v0, LK/G;

    .line 28
    .line 29
    const/4 v1, 0x2

    .line 30
    const v2, 0x104000b

    .line 31
    .line 32
    .line 33
    const-string v3, "Paste"

    .line 34
    .line 35
    invoke-direct {v0, v3, v1, v2}, LK/G;-><init>(Ljava/lang/String;II)V

    .line 36
    .line 37
    .line 38
    sput-object v0, LK/G;->d:LK/G;

    .line 39
    .line 40
    new-instance v0, LK/G;

    .line 41
    .line 42
    const/4 v1, 0x3

    .line 43
    const v2, 0x104000d

    .line 44
    .line 45
    .line 46
    const-string v3, "SelectAll"

    .line 47
    .line 48
    invoke-direct {v0, v3, v1, v2}, LK/G;-><init>(Ljava/lang/String;II)V

    .line 49
    .line 50
    .line 51
    sput-object v0, LK/G;->e:LK/G;

    .line 52
    .line 53
    invoke-static {}, LK/G;->a()[LK/G;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    sput-object v0, LK/G;->f:[LK/G;

    .line 58
    .line 59
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, LK/G;->a:I

    .line 5
    .line 6
    return-void
.end method

.method private static final synthetic a()[LK/G;
    .locals 4

    .line 1
    sget-object v0, LK/G;->b:LK/G;

    .line 2
    .line 3
    sget-object v1, LK/G;->c:LK/G;

    .line 4
    .line 5
    sget-object v2, LK/G;->d:LK/G;

    .line 6
    .line 7
    sget-object v3, LK/G;->e:LK/G;

    .line 8
    .line 9
    filled-new-array {v0, v1, v2, v3}, [LK/G;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LK/G;
    .locals 1

    .line 1
    const-class v0, LK/G;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LK/G;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[LK/G;
    .locals 1

    .line 1
    sget-object v0, LK/G;->f:[LK/G;

    .line 2
    .line 3
    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [LK/G;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final b(LY/m;I)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-static {}, LY/w;->L()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    const-string v1, "androidx.compose.foundation.text.TextContextMenuItems.resolvedString (ContextMenu.android.kt:89)"

    .line 9
    .line 10
    const v2, -0x12744279

    .line 11
    .line 12
    .line 13
    invoke-static {v2, p2, v0, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    iget p2, p0, LK/G;->a:I

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    invoke-static {p2, p1, v0}, LP0/f;->a(ILY/m;I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-static {}, LY/w;->L()Z

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    if-eqz p2, :cond_1

    .line 28
    .line 29
    invoke-static {}, LY/w;->T()V

    .line 30
    .line 31
    .line 32
    :cond_1
    return-object p1
.end method
