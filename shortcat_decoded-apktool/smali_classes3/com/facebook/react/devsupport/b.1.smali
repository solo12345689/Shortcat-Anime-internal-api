.class public final Lcom/facebook/react/devsupport/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/devsupport/b$a;,
        Lcom/facebook/react/devsupport/b$b;
    }
.end annotation


# static fields
.field public static final c:Lcom/facebook/react/devsupport/b$b;


# instance fields
.field private final a:Ldg/A;

.field private b:Ldg/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/devsupport/b$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/facebook/react/devsupport/b$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/devsupport/b;->c:Lcom/facebook/react/devsupport/b$b;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ldg/A;)V
    .locals 1

    .line 1
    const-string v0, "client"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/facebook/react/devsupport/b;->a:Ldg/A;

    .line 10
    .line 11
    return-void
.end method

.method public static final synthetic a(Lcom/facebook/react/devsupport/b;)Ldg/e;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/devsupport/b;->b:Ldg/e;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic b(Lcom/facebook/react/devsupport/b;Ljava/lang/String;ILdg/t;Ltg/j;Ljava/io/File;Lcom/facebook/react/devsupport/b$a;Lc7/c;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p7}, Lcom/facebook/react/devsupport/b;->f(Ljava/lang/String;ILdg/t;Ltg/j;Ljava/io/File;Lcom/facebook/react/devsupport/b$a;Lc7/c;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic c(Lcom/facebook/react/devsupport/b;Ljava/lang/String;Ldg/E;Ljava/lang/String;Ljava/io/File;Lcom/facebook/react/devsupport/b$a;Lc7/c;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, Lcom/facebook/react/devsupport/b;->g(Ljava/lang/String;Ldg/E;Ljava/lang/String;Ljava/io/File;Lcom/facebook/react/devsupport/b$a;Lc7/c;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic d(Lcom/facebook/react/devsupport/b;Ldg/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/devsupport/b;->b:Ldg/e;

    .line 2
    .line 3
    return-void
.end method

.method private final f(Ljava/lang/String;ILdg/t;Ltg/j;Ljava/io/File;Lcom/facebook/react/devsupport/b$a;Lc7/c;)V
    .locals 1

    .line 1
    const/16 v0, 0xc8

    .line 2
    .line 3
    if-eq p2, v0, :cond_1

    .line 4
    .line 5
    invoke-interface {p4}, Ltg/j;->M1()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p3

    .line 9
    sget-object p4, LU6/b;->b:LU6/b$a;

    .line 10
    .line 11
    invoke-virtual {p4, p1, p3}, LU6/b$a;->c(Ljava/lang/String;Ljava/lang/String;)LU6/b;

    .line 12
    .line 13
    .line 14
    move-result-object p4

    .line 15
    if-eqz p4, :cond_0

    .line 16
    .line 17
    invoke-interface {p7, p4}, Lc7/c;->onFailure(Ljava/lang/Exception;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    new-instance p4, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    const-string p5, "The development server returned response error code: "

    .line 27
    .line 28
    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string p2, "\n\n"

    .line 35
    .line 36
    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string p5, "URL: "

    .line 40
    .line 41
    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string p1, "Body:\n"

    .line 51
    .line 52
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    new-instance p1, LU6/b;

    .line 59
    .line 60
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    const-string p3, "toString(...)"

    .line 65
    .line 66
    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-direct {p1, p2}, LU6/b;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-interface {p7, p1}, Lc7/c;->onFailure(Ljava/lang/Exception;)V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :cond_1
    if-eqz p6, :cond_2

    .line 77
    .line 78
    sget-object p2, Lcom/facebook/react/devsupport/b;->c:Lcom/facebook/react/devsupport/b$b;

    .line 79
    .line 80
    invoke-static {p2, p1, p3, p6}, Lcom/facebook/react/devsupport/b$b;->a(Lcom/facebook/react/devsupport/b$b;Ljava/lang/String;Ldg/t;Lcom/facebook/react/devsupport/b$a;)V

    .line 81
    .line 82
    .line 83
    :cond_2
    new-instance p1, Ljava/io/File;

    .line 84
    .line 85
    invoke-virtual {p5}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    new-instance p3, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    const-string p2, ".tmp"

    .line 98
    .line 99
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    invoke-direct {p1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    sget-object p2, Lcom/facebook/react/devsupport/b;->c:Lcom/facebook/react/devsupport/b$b;

    .line 110
    .line 111
    invoke-static {p2, p4, p1}, Lcom/facebook/react/devsupport/b$b;->b(Lcom/facebook/react/devsupport/b$b;Ltg/j;Ljava/io/File;)Z

    .line 112
    .line 113
    .line 114
    move-result p2

    .line 115
    if-eqz p2, :cond_4

    .line 116
    .line 117
    invoke-virtual {p1, p5}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 118
    .line 119
    .line 120
    move-result p2

    .line 121
    if-eqz p2, :cond_3

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_3
    new-instance p2, Ljava/io/IOException;

    .line 125
    .line 126
    new-instance p3, Ljava/lang/StringBuilder;

    .line 127
    .line 128
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 129
    .line 130
    .line 131
    const-string p4, "Couldn\'t rename "

    .line 132
    .line 133
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    const-string p1, " to "

    .line 140
    .line 141
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {p3, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    throw p2

    .line 155
    :cond_4
    :goto_0
    invoke-interface {p7}, Lc7/c;->a()V

    .line 156
    .line 157
    .line 158
    return-void
.end method

.method private final g(Ljava/lang/String;Ldg/E;Ljava/lang/String;Ljava/io/File;Lcom/facebook/react/devsupport/b$a;Lc7/c;)V
    .locals 10

    .line 1
    move-object/from16 v6, p6

    .line 2
    .line 3
    invoke-virtual {p2}, Ldg/E;->a()Ldg/F;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v7, "\n                    \n                    \n                    "

    .line 8
    .line 9
    const-string v8, "\n                    \n                    URL: "

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    new-instance p3, LU6/b;

    .line 14
    .line 15
    invoke-virtual {p2}, Ldg/E;->b()I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    new-instance p4, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    const-string p5, "\n                    Error while reading multipart response.\n                    \n                    Response body was empty: "

    .line 25
    .line 26
    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-static {p1}, LDf/r;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-direct {p3, p1}, LU6/b;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-interface {v6, p3}, Lc7/c;->onFailure(Ljava/lang/Exception;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_0
    invoke-virtual {p2}, Ldg/E;->a()Ldg/F;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    if-eqz v0, :cond_1

    .line 61
    .line 62
    invoke-virtual {v0}, Ldg/F;->k()Ltg/j;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    goto :goto_0

    .line 67
    :cond_1
    const/4 v0, 0x0

    .line 68
    :goto_0
    if-eqz v0, :cond_3

    .line 69
    .line 70
    new-instance v9, Lcom/facebook/react/devsupport/n0;

    .line 71
    .line 72
    invoke-direct {v9, v0, p3}, Lcom/facebook/react/devsupport/n0;-><init>(Ltg/j;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    new-instance v0, Lcom/facebook/react/devsupport/b$d;

    .line 76
    .line 77
    move-object v2, p0

    .line 78
    move-object v3, p1

    .line 79
    move-object v1, p2

    .line 80
    move-object v4, p4

    .line 81
    move-object v5, p5

    .line 82
    invoke-direct/range {v0 .. v6}, Lcom/facebook/react/devsupport/b$d;-><init>(Ldg/E;Lcom/facebook/react/devsupport/b;Ljava/lang/String;Ljava/io/File;Lcom/facebook/react/devsupport/b$a;Lc7/c;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v9, v0}, Lcom/facebook/react/devsupport/n0;->d(Lcom/facebook/react/devsupport/n0$a;)Z

    .line 86
    .line 87
    .line 88
    move-result p3

    .line 89
    if-nez p3, :cond_2

    .line 90
    .line 91
    new-instance p3, LU6/b;

    .line 92
    .line 93
    invoke-virtual {p2}, Ldg/E;->b()I

    .line 94
    .line 95
    .line 96
    move-result p2

    .line 97
    new-instance p4, Ljava/lang/StringBuilder;

    .line 98
    .line 99
    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    .line 100
    .line 101
    .line 102
    const-string p5, "\n                    Error while reading multipart response.\n                    \n                    Response code: "

    .line 103
    .line 104
    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {p4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {p4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    invoke-static {p1}, LDf/r;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    invoke-direct {p3, p1}, LU6/b;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    invoke-interface {v6, p3}, Lc7/c;->onFailure(Ljava/lang/Exception;)V

    .line 131
    .line 132
    .line 133
    :cond_2
    return-void

    .line 134
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 135
    .line 136
    const-string p2, "Required value was null."

    .line 137
    .line 138
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    throw p1
.end method


# virtual methods
.method public final e(Lc7/c;Ljava/io/File;Ljava/lang/String;Lcom/facebook/react/devsupport/b$a;Ldg/C$a;)V
    .locals 2

    .line 1
    const-string v0, "callback"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "outputFile"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "requestBuilder"

    .line 12
    .line 13
    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "Required value was null."

    .line 17
    .line 18
    if-eqz p3, :cond_1

    .line 19
    .line 20
    invoke-virtual {p5, p3}, Ldg/C$a;->m(Ljava/lang/String;)Ldg/C$a;

    .line 21
    .line 22
    .line 23
    move-result-object p3

    .line 24
    const-string p5, "Accept"

    .line 25
    .line 26
    const-string v1, "multipart/mixed"

    .line 27
    .line 28
    invoke-virtual {p3, p5, v1}, Ldg/C$a;->a(Ljava/lang/String;Ljava/lang/String;)Ldg/C$a;

    .line 29
    .line 30
    .line 31
    move-result-object p3

    .line 32
    invoke-virtual {p3}, Ldg/C$a;->b()Ldg/C;

    .line 33
    .line 34
    .line 35
    move-result-object p3

    .line 36
    iget-object p5, p0, Lcom/facebook/react/devsupport/b;->a:Ldg/A;

    .line 37
    .line 38
    invoke-virtual {p5, p3}, Ldg/A;->a(Ldg/C;)Ldg/e;

    .line 39
    .line 40
    .line 41
    move-result-object p3

    .line 42
    iput-object p3, p0, Lcom/facebook/react/devsupport/b;->b:Ldg/e;

    .line 43
    .line 44
    if-eqz p3, :cond_0

    .line 45
    .line 46
    new-instance p5, Lcom/facebook/react/devsupport/b$c;

    .line 47
    .line 48
    invoke-direct {p5, p0, p1, p2, p4}, Lcom/facebook/react/devsupport/b$c;-><init>(Lcom/facebook/react/devsupport/b;Lc7/c;Ljava/io/File;Lcom/facebook/react/devsupport/b$a;)V

    .line 49
    .line 50
    .line 51
    invoke-interface {p3, p5}, Ldg/e;->O1(Ldg/f;)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 56
    .line 57
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw p1

    .line 61
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 62
    .line 63
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw p1
.end method
